package Spaceship.Operations;

public class IoC {
    public static Object Resolve(String key, Object... args) {
        if (key.equals("Adapter")) {
            if (args[0] instanceof Class && args.length > 1 && args[1] instanceof UObject) {
                Class<?> adapterClass = (Class<?>) args[0];
                UObject obj = (UObject) args[1];
                try {
                    // Создаем экземпляр адаптера с использованием рефлексии
                    return adapterClass.getDeclaredConstructor(UObject.class).newInstance(obj);
                } catch (Exception e) {
                    e.printStackTrace();
                    return null;
                }
            }
        }
        if (key.contains("position")) {
            return new Vector(0, 0); // Возвращаем начальную позицию
        } else {
            return null; // Заглушка
        }
    }
}
