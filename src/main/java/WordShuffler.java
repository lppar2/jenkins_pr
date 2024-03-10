import java.util.Random;

public class WordShuffler {
    public static String shuffleWord(String word) {
        // Преобразуем слово в массив символов
        char[] charArray = word.toCharArray();
        // Создаем объект Random для генерации случайных чисел
        Random random = new Random();

        // Перемешиваем буквы в слове
        for (int i = 0; i < charArray.length; i++) {
            // Генерируем случайный индекс от 0 до длины слова
            int randomIndex = random.nextInt(charArray.length);
            // Меняем местами текущий символ с символом на случайном индексе
            char temp = charArray[i];
            charArray[i] = charArray[randomIndex];
            charArray[randomIndex] = temp;
        }

        // Преобразуем массив символов обратно в строку
        return new String(charArray);
    }

    public static void main(String[] args) {
        String word = "example";
        String shuffledWord = shuffleWord(word);
        System.out.println("Original word: " + word);
        System.out.println("Shuffled word: " + shuffledWord);
    }
}
