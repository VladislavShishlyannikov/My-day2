start:
    // Блок приветствия
    #bot
    Привет! Я твой голосовой помощник "Мой день". Я могу помочь напомнить о задачах, рассказать про погоду или напомнить о встречах. Чем займемся?

    // Варианты ответа пользователя
    // Переход к соответствующим блокам
    + Напомни о задачах
    -> tasks

    + Какая погода
    -> weather

    + Напомни о встречах
    -> meetings

    + Ничего
    #bot
    Хорошо, обращайся, если что-то понадобится!

// Блок задач
tasks:
    #bot
    Сегодня у тебя 3 задачи:
    1. Закончить проект на работе.
    2. Купить продукты.
    3. Позвонить бабушке.
    Чем-то еще могу помочь?

    // Возврат в меню
    + Нет
    -> start

    + Да
    -> start

// Блок погоды
weather:
    #bot
    Сейчас за окном +5°C, облачно. Возьми зонт на всякий случай. Чем еще могу помочь?

    // Возврат в меню
    + Нет
    -> start

    + Да
    -> start

// Блок встреч
meetings:
    #bot
    Сегодня у тебя одна встреча: в 14:00 с клиентом. Напомнить за 10 минут до нее?

    // Обработка ответа пользователя
    + Да
    #bot
    Отлично, я напомню за 10 минут до встречи.

    + Нет
    #bot
    Хорошо, чем-то еще могу помочь?

    // Возврат в меню
    -> start
