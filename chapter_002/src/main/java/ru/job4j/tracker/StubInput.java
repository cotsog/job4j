package ru.job4j.tracker;

/**
 * Input for StartUITest.
 *
 * @author Maxim Vanny.
 * @version 2.0
 * @since 0.1
 */
public class StubInput implements Input {
    /**
     * Это поле содержит последовательность ответов пользователя.
     * Например. Если пользователь
     * хочет выбрать добавление новой заявки ему нужно ввести:
     * 0 - выбор пункта меню "добавить новую заявку".
     * name - имя заявки
     * desc - описание заявки
     * y - выйти из трекера.
     */
    private final String[] value;

    /**
     * Поле считает количество вызовов метода ask.
     * При каждом вызове надо передвинуть указатель на новое число.
     */
    private int position;

    /**
     * Конструктор.
     *
     * @param value массив ответов пользователя.
     */
    public StubInput(final String[] value) {
        this.value = value;
    }

    /**
     * Давайте рассмотрим, как работает этот метод.
     * у нас есть объект в котором содержатся заранее продуманные ответы.
     * При последовательном вызове метода ask нам надо возвращать соответствующие данные.
     * Как если бы мы симулировали поведение пользователя.
     * Для этого при каждом вызове метода ask мы увеличиваем счетчик и
     * при следующем вызове он вернет нам новое значение.
     */
    @Override
    public String ask(final String question) {
        return this.value[this.position++];
    }

    /**
     * Метод получает ключ на ответ пользователя.
     *
     * @param question запрос для пользователя.
     * @param range    диапзон пунктов мен.
     * @return возвращает -1.
     */

    @Override
    public int ask(final String question, final int[] range) {
        return -1;
    }
}

