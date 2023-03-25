<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>show details</title>
</head>

<body>
<h2>Dear employee, your are welcome</h2>
<br><br><br>

<!-- При работе через Spring MVC формы и модель мы теперь указываем параметры как поля класса.
     При такой работе срабатывают getters на поля объекта. -->
<p>Employee name: ${employee.name}</p>
<p>Employee surname: ${employee.surname}</p>
<p>Employee salary: ${employee.salary}</p>
<p>Employee department: ${employee.department}</p>
<p>Employee car: ${employee.carBrand}</p>
</body>
</html>