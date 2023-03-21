/*объединения нескольких запросов в одну таблицу*/

SELECT o.id, o.creation_date
FROM `order` o 
JOIN `order_status` s ON s.`id` = `o`.`status_id`
WHERE `s`.`code` IN('APPROVED_BY_STOCK', 'PACKED')
UNION
SELECT o.id, o.creation_date
FROM `order` o 
JOIN `user` u ON u.`id` = `o`.`user_id`
WHERE u.reg_date BETWEEN '2018-02-01' AND '2018-02-28'
UNION
SELECT o.id, o.creation_date
FROM `good` g 
JOIN `order2good` o2g ON o2g.good_id = g.id
JOIN `order` o ON o.id = o2g.order_id
WHERE g.name LIKE '%йогурт%';

/*вставка новой записи в таблицу*/

INSERT INTO `good` (`category_id`,`name`, `count`, `price`)
VALUES(6,'Белый чай с вишней', 50, 344)

/*UPDATE-запрос*/
UPDATE `good` SET
3.12 8.17

UPDATE `good` SET
price = price + 50
WHERE `count` > 0 AND `count` < 10

DELETE FROM `good` WHERE `good`.`price` > 1000

/*выражения*/
SELECT
	`name`,
	`price` * `count` AS cost
FROM `good`;

SELECT
	`id`,
	`name`,
	IF(
	`count` >= 100,
	'ENOUGH',
	'NOT_ENOUGH'
	) isEnough
FROM `good`

/*ФУНКЦИИ*/
SELECT
	`category_id`,
	COUNT(*)
FROM	`good`
GROUP BY `category_id`

SELECT
	`category_id`,
	COUNT(DISTINCT `name`)
FROM	`good`
GROUP BY `category_id`


/*IF operator/*
SELECT
	`id`,
	`name`,
	IF(
		`count` < 20,
		`price` * 0.8,
		`price`
	) `price`
FROM `good`

/*NULL conditions*/
SELECT
	`id`,
	`name`,
	IF(
	`parent_id` IS NULL,
	'YES',
	'NO'
	) `is_root`
FROM `good_category`

SELECT
	`id`,
	`name`,
	IF(
	`count` < 20 OR `count` > 500,
	`price` * 0.8,
	`price`
	) `price`
FROM `good`
/*скобки в условиях*/
SELECT
	`id`,
	`name`,
	IF(
	(`count` < 20 OR `count` > 500)
	AND `price` > 600,
	`price` * 0.8,
	`price`
	) `price`
FROM `good`

/*вложенные IF*/
SELECT
	`id`,
	`name`,
	IF(
	`count` < 20,
	'Мало',
	IF(
		`count` > 500,
	'Много',
	'Нормально',
	)	
) `count`
FROM `good`

/*CASE oparator*/
SELECT
	`id`,
	`name`,
	CASE
		WHEN `count` < 20 THEN 'Little'
		WHEN `count` > 500 THEN 'Much'
		ELSE 'Normal'
	END `count`
FROM `good` WHERE 1



SELECT
	IF(
        `status_id`  = 7 OR `status_id` = 8,
		IF(
            `creation_date` < '2020-01-01',
    		'Старый',
			'Новый'
            ),
        IF(
            `creation_date` < '2020-01-01',
    		'Устаревшый',
			'Новый'
        ) `label`
FROM `order` 
GROUP BY `status_id`,
		`creation_date` DESC

/*функции работы со строками*/
/*String lenght*/
SELECT
	`id`,
	`name`,
	CHAR_LENGTH(`name`) `length`
FROM `good`
/*find substring*/
SUBSTRING('cofee', 2, 2) /*of*/ в SQL нумерация символов начинается с 1
SUBSTR(string, start, length)

/*обрезка подстроки*/
SELECT
	`id`,
	SUBSTR(`name`, 1, 20) `name`
FROM `good`

/*объединение строк*/
CONCAT(exp1, exp2, exp3, ...)

SELECT
	`id`,
	IF(
	CHAR_LENGTH(`name`) > 20,
	CONCAT(
		SUBSTR(`name`, 1, 20),
		'...'
	),
	`name`
	) `name`
FROM `good	

/*объединение строк при группировке*/
GROUP_CONCAT(field SEPARATOR ', ')

/*Удаление пробелов по краям строки*/
TRIM(str)

SELECT
	o.id,
	GROUP_CONCAT(
	TRIM(g.name) SEPARATOR ', '
	) products
FROM `order` o
JOIN `order2good` o2g ON
	o2g.order_id = o.id
JOIN `good` g ON
	g.id = o2g.good_id
GROUP BY o.id

/*замена подстрок*/
REPLACE(field, from, to)
SELECT
	id,
	REPLACE(
		REPLACE(`name`, '<<', '"'),
	'>>',
	'"'
	) `name`
FROM `good`

/*формат даты*/
DATE_FORMAT(field, format)

DATE_FORMAT(
	field,
	'%d.'%m.%Y'
)


SELECT
	`id`,
	DATE_FORMAT(
	`creation_date`,
	'%d.%m.%Y'
	) creationDate
FROM `order`

SELECT
	DATE_FORMAT(
	creation_date,
	'%m'
	) `month`,
	COUNT(*) `count`
FROM `order`
GROUP BY `month`
ORDER BY `month`


/*функции вывода свойств даты*/
DAYOFWEEK(date)
DAYOFYEAR(date)

SELECT
	DAYOFWEEK(creation_date) `day`,
	COUNT(*) `count`
FROM `order`
GROUP BY `day`
ORDER BY `day`

/*date now*/
NOW()
CURDATE()
INSERT INTO `user` (
	`name`,
	`email`,
	`password`,
	`reg_date`)
VALUES	(
	'Дмитрий Петров',
	'petrov@gmail.com',
	'b2974ddcf2ff',
	NOW()
)

/*разница между двумя датами*/
DATEDIFF(date2, date 1)

SELECT DATEDIFF(
	NOW(),
	'2021-12-14'
)


/*work with timestamp*/
UNIT_TIMESTAMP(date)
FROM_UNIXTIME(timestamp)

SELECT
UNIX_TIMESTAMP (`creation_date`)
FROM `order` 
WHERE `id` = 248

SELECT
FROM_UNIXTIME (1)


/*agregation function*/
COUNT(*)
SUM(field)
MAX(field)
MIN(field)
AVG(field)

SELECT COUNT(DISTINCT `name`)
FROM `good`

SELECT SUM(`price` * `count`)
FROM `good`


SELECT SUM(
	IF(`count` < 50, 1, 0)
)
FROM `good`

SELECT MIN(`price`) minPrice, MAX(`price`) maxPrice
FROM `good`

/*фильтрация после группировки, оператор HAVING)
SELECT
	`category_id`,
	COUNT(*) `count`
FROM `good`
GROUP BY `category_id`
HAVING `count` < 50 OR
	`count` > 300

SELECT 
	c.name,
    COUNT(*) `count`
FROM `good` g
JOIN good_category c ON c.id = g.category_id
GROUP BY g.category_id
HAVING `count` < 50

SELECT
	o.id,
    SUM(o2g.count * g.price) `total_price`
FROM `order` o 
JOIN order2good o2g ON o2g.order_id = o.id
JOIN good g ON g.id = o2g.good_id
GROUP BY o.id
HAVING `total_price` > 1000

/*Установка индексов при создании*/
CREATE TABLE `good_type` (
	`id` INT NOT NULL AUTO_INCREMENT,
	`name` VARCHAR(255),
	PRIMARY KEY(`id`)
);

/*Установка индексов после создания таблицы*/
ALTER TABLE `good`
	ADD PRIMARY KEY (`id`);

/*уникальный индекс*/
ALTER TABLE `good_type`
	ADD UNIQUE (`code`);

/*установка индекса по нескольким полям*/
ALTER TABLE `order_status_change`
	ADD KEY (
		`src_status_id`,
		`dst_status_id`
	);

/*индекс по текстовым значением с обязательным указанием длинны ключа*/
ALTER TABLE `good`
	ADD KEY (`name` (30));


/*Установка связи 'один ко многим'*/
ALTER TABLE `good`
	ADD FOREIGN KEY (`category_id`)
	REFERENCES `good_category`(`id`);


/*Установка связи 'один ко одному'*/
/*1) установка уникального ключа*/
ALTER TABLE `countries` ADD UNIQUE (`capital_id`);
/*2) установка внешнего ключа*/
ALTER TABLE `countries`
	ADD FOREIGN KEY (`capital_id`)
	REFERENCES `capitals`(`id`);

/*3) Установка связи 'многие ко многим'*/
CREATE TABLE `book2order` (
	`id` INT NOT NULL AUTO_INCREMENT,
	`book_id` INT NOT NULL,
	`order_id` INT NOT NULL,
	PRIMARY KEY(`id`),
	FOREIGN KEY(`book_id`)
		REFERENCES `books`(`id`),
	FOREIGN KEY (`order_id`)
		REFERENCES `orders`(`id`),
	UNIQUE(`book_id`, `order_id`)
);

/*именование ключей и ограничений*/
ALTER TABLE `book2order`
	ADD CONSTRAINT `book2order_fk_1`
		FOREIGN KEY (`order_id`)
		REFERENCES `order` (`id`),
	ADD CONSTRAINT `book2order_fk_2`
		FOREIGN KEY (`book_id`)
		REFERENCES `book` (`id`);

/*удаление ключа*/
ALTER TABLE `book2order`
	DROP INDEX `book2order_fk_2`;

/*обеспечение целостности данных*/
ALTER TABLE `good`
	ADD FOREIGN KEY (`category_id`)
	REFERENCES `good_category`(`id`);
	ON DELETE SET NULL
	ON UPDATE NO ACTION;

/*вложенные запросы*/
/*шаг 1 считаем общие стоимости*/
SELECT
	`id`,
	(`count` * `price`) totalPrice
FROM `good`
GROUP BY `id`
/*шаг 2 разделяем общие стоимости на две группы*/
SELECT
	SUM(IF(totalPrice > 10000, totalPrice, 0))
		highPriceTotal,
	SUM(IF(totalPrice <= 10000, totalPrice, 0))
		lowPriceTotal
FROM (
	SELECT
		`id`,
		(`count` * `price`) totalPrice
	FROM `good`
	GROUP BY `id`
) t

/*вложенные запросы (подзапросы) в условиях*/
SELECT
	`id`,
	(`count` * `price`) totalPrice
FROM `good`
WHERE `category_id` IN(
	SELECT `category_id`
	FROM `good`
	GROUP BY `category_id`
	HAVING COUNT(*) > 50
)
GROUP BY `id`

/*разбиеные предыдущего ресурсоемкого запроса на два отдельных запроса*/
/*выбираем таблицу категорий, каждая из которых имеет 50 записей*/
SELECT `category_id`
FROM `good`
GROUP BY `category_id`
HAVING COUNT(*) > 50;
/*сохраняем полученное значение ячеек `category_id` в строку и вставляем аргументом функции IN*/
SELECT
	`id`,
	(`count` * `price`) totalPrice
FROM `good`
WHERE `category_id` IN(43, 261, 4429)
GROUP BY `id`

/*структурные запросы
запросы управления базами данных*/
SHOW DATABASES;
/*перейти к конкретной базе данных*/
USE `databaseName`
/*создание и удаление базы данных*/
CREATE DATABASE `databaseName`;
DROP DATABASE `databaseName`;
/*запросы управления таблицами после предварительного выбора конкретной базы данных операторов USE*/
SHOW TABLES;
/*потом можно просмотреть структуру этой таблицы*/
DESCRIBE `tableName`;
/*создать таблицу*/
CREATE TABLE `good_type`(
	`id` INT NOT NULL AUTO_INCREMENT,
	`sort_index` INT,
	`name` VARCHAR(255),
	PRIMARY KEY(`id`)
);
/*изменить существующую таблицу*/
ALTER TABLE `good_type`
	DROP COLUMN `name`,
	ADD `code` TEXT NOT NULL
	AFTER `id`;

/*очистить таблицу c автоматическим сбросом индекса автоинкремента*/
TRUNCATE `tableName`
/*удалить таблицу*/
DROP TABLE `tableName`;

/*представления*/
select * from `good`
where `count` < 10 and `price` > 200;
/*создать представление*/
CREATE VIEW `ending_goods` AS
SELECT * FROM `good`
WHERE `count` < 10 AND `price` > 200;
/*использование представления*/
SELECT * FROM `ending_goods`;
/*создание или изменение представления*/
CREATE OR REPLACE VIEW
	`ending_goods` AS
SELECT * FROM `good`
WHERE `count` < 10 AND `price` > 200;
/*удалить представление*/
DROP VIEW `ending_goods`;










































