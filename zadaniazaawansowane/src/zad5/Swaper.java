package zad5;
//Napisz metodę generyczną, które zadaniem będzie zamiana (swap) elementów o wskazanych pozycjach w tablicy.
// Metoda powinna przyjmować:
// - tablicę dowolnego typu elementów
// - pozycję pierwszego elementu
// - pozycję drugiego elementu
// tzn, np. jeśli mamy tablice 10 elementów, podamy pozycję 1: 4, pozycję 2: 8 to należy dokonać zamiany:
// - element pod indeksem 4 musi znaleść się pod indeksem 8, a element o indeksie 8 musi znaleść się pod indeksem 4
public class Swaper {
    public <T> T[] swapElementInArray(T[] array, int indexA, int indexB){
        if(indexA < 0 || indexA >= array.length || indexB < 0 || indexB >= array.length){
            return array;
        }
        T elementToSwap = array[indexB];
        array[indexB]=array[indexA];
        array[indexA]=elementToSwap;
        return array;
    }
}
