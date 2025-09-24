public class BinarySearch {
    int binarySearch(int[] sortedArray, int element) {
        // в начале левая и правая границы равны первому и последнему элементу массива
        var left = 0;
        var right = sortedArray.length - 1;
        // пока левая и правая границы поиска не пересеклись
        while (left <= right) {
            // индекс текущего элемента находится посередине
            var middle = left + (right - left) / 2;
            var current = sortedArray[middle];
            if (current == element) {
                // нашли элемент — возвращаем его индекс
                return middle;
            } else if (current < element) {
                // текущий элемент меньше искомого — сдвигаем левую границу
                left = middle + 1;
            } else {
                // иначе сдвигаем правую границу
                right = middle - 1;
            }
        }
        // проверили весь массив, но не нашли элемент
        return -1;
    }

    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();
        int[] nums = {1, 3, 7, 11, 77, 99, 103};
        System.out.println("Искомый элемент под индексом: " + binarySearch.binarySearch(nums, 103));
    }
}
