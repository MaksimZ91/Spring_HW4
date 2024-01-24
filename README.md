## Spring MVC. Использование шаблонизатора Thymeleaf  
Базовое задание:  
1. Создание базового веб-приложения Spring MVC  
Начните с создания простого веб-приложения с использованием Spring MVC. Это может быть простой сайт, который выводит "Привет, мир!" на главной странице. Используйте аннотацию @Controller и @RequestMapping для маршрутизации запросов на эту страницу.  
2. Добавление Thymeleaf в проект  
Добавьте Thymeleaf в свое веб-приложение Spring MVC. Создайте простую страницу с некоторыми переменными, которые заполняются с помощью модели Spring MVC и отображаются на странице с использованием Thymeleaf.  
3. Создание формы ввода и обработка данных формы  
Создайте страницу с формой ввода, используя Thymeleaf для рендеринга формы. Затем создайте контроллер Spring MVC, который обрабатывает отправку формы и выводит полученные данные.  
Это может быть форма для регистрации или любая другая форма, которая собирает информацию от пользователя.  
![home](https://github.com/MaksimZ91/Spring_HW4/assets/72209139/20ff66eb-1ed8-4f25-b147-0bfee8ef51d3)
![create](https://github.com/MaksimZ91/Spring_HW4/assets/72209139/8ca2b33d-2c84-455b-85c8-65de4697f784)
![list](https://github.com/MaksimZ91/Spring_HW4/assets/72209139/75cce236-52fa-43cc-94c1-82432d29b7cf)
![delete](https://github.com/MaksimZ91/Spring_HW4/assets/72209139/886252b9-04fd-4f3e-aa17-c5f4fb59b75d)
![update](https://github.com/MaksimZ91/Spring_HW4/assets/72209139/d486ae4f-d81d-44a0-98fb-5deabe430660)

Задание со звездочкой:  
Проект домашнего задания для 2 семинара (CRUD приложение USER SERVICE) переписать:  
1. Использовать библиотеку Lomboc:  
a) @Data - для полей классов  
b) @AllArgsConstructor - для классов с конструкторами  
c) @Log - логировать работу всех контроллеров  
2. Использовать configuration-processor для работы с настройками приложения:  
a) Создать объект инкапсулирующий шаблоны запросов к базе данных H2  
b) Использовать аннотации @ConfigurationProperties и @ConfigurationPropertiesScan для заполнения полей этого класса  
с) Вынести все SQL шаблоны в настройки приложения.
![HW2AppProp](https://github.com/MaksimZ91/Spring_HW4/assets/72209139/27e45963-de31-4650-ab41-5af96fb10f47)
![HW2SQLProp](https://github.com/MaksimZ91/Spring_HW4/assets/72209139/850d8c18-238c-486f-be25-af33a2636f41)


