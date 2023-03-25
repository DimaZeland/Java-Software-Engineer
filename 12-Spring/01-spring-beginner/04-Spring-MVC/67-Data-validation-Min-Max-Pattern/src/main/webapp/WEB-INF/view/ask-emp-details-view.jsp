<!-- Подключение Spring MVC форм-->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!doctype html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>ask details</title>
</head>

<body>
<h2>Dear Employee, Please enter your details</h2>
<br>
<br>

<!-- В modelAttribute прописываем в какую модель мы будем делать запись.
     В path прописываем куда именно будет вноситься информация.
     В данном случае через path вызываются getters. Но поскольку мы только создали объект,
     то они имеют значение null -->
<form:form action="showDetails" modelAttribute="employee">
    Name <form:input path="name"/>
    <form:errors path="name"/>
    <br>
    Surname <form:input path="surname"/>
    <form:errors path="surname"/>
    <br>
    Salary <form:input path="salary"/>
    <form:errors path="salary"/>
    <br>
    Phone number <form:input path="phoneNumber"/>
    <form:errors path="phoneNumber"/>
    <br>
    Department <form:select path="department">
    <!-- Spring форма выпадающего списка.
    value - то, что реально присвоится, то что мы будем видеть в show-emp-details
    label - скоращение, то что будет в указано в самом списке -->
    <form:option value="Information Technology" label="IT"/>
    <form:option value="Human Resources" label="HR"/>
    <form:option value="Sales" label="Sales"/>
</form:select>
    <br>
    Which car do you want?
    <!-- Выбор не из хардкод html кода, а из колекции java HashMap-->
    <form:radiobuttons path="carBrand" items="${employee.carBrands}"/>
    <br>
    Foreign Language(s)
    <form:checkboxes path="languages" items="${employee.languageMap}"/>
    <!-- После нажатия submit вызываются setters-->
    <input type="submit" value="OK">
</form:form>

</body>

</html>