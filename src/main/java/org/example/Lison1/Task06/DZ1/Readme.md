# Принцыпы SOLID В данном проекте
1) **SRP** <br>
    StudentView тольео возвращает в консоль, StudentGroupIterator только сортирует список студентов.
2) **OSP** <br>
    При создании Student мы можем добавить Id, дату рождения, среднюю оценку, но мы обязательно должны использовать User
3) **LSP** <br>
   StudentGroup использует Student для получения данных и дальнейшей обработки 
4) **IRP** <br>
    Для вывода Группы студентов мы используем StudentView который обращается в UserView, если мы будем создавать учителя мы быдем использовать ковый класс для вывода данных.
5) **DIP** <br>
    User в нашем случае является классом верхнего уровня а класс Student будет нижним так же мы можем создать например учителей и выпускников они будут в отдельных классах.