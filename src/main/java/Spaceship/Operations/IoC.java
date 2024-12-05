package Spaceship.Operations;

public class IoC {
    public static Object Resolve(String key, Object... args) {
        // Ваша реализация для возврата экземпляра объекта по ключу
        // Для тестирования можно просто возвращать новый экземпляр Vector
        if (key.contains("position")) {
            return new Vector(0, 0); // Возвращаем начальную позицию
        } else {
            return null; // Заглушка
        }
    }
}
