# codding

## MyLinkedList

`MyLinkedList` находится в:
`src/main/java/Struct/MyLinkedList.java`

Это простая односвязная реализация списка для `int`.

### Доступные методы

- `void add(int value)`
  Добавляет элемент в конец списка.

- `int get(int index)`
  Возвращает значение по индексу.
  Если индекс вне диапазона, бросает `IllegalArgumentException`.

- `void remove(int index)`
  Удаляет элемент по индексу.

- `int size()`
  Возвращает текущее количество элементов.

- `String toString()`
  Возвращает представление списка в формате массива, например: `[1, 2, 3]`.

### Пример использования

```java
MyLinkedList list = new MyLinkedList();
list.add(10);
list.add(20);

int first = list.get(0); // 10
int count = list.size(); // 2

list.remove(1);
System.out.println(list); // [10]
```

### Тесты

Тесты расположены в:
`src/test/java/Struct/MyLinkedListTest.java`

Запуск:

```bash
mvn test
```

### Известные ограничения текущей версии

- Нет проверки некорректных индексов в `remove(int index)` (например, индекс больше размера списка).
- Нет обработки удаления из пустого списка.
- Реализация предназначена для учебных целей, не потокобезопасна.
