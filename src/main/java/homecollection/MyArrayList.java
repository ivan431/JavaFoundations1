package homecollection;

import java.util.Arrays;
import java.util.Collection;


public class MyArrayList {
    private Object[] array;
    private int realSize;
    public final static int DEFAULT_CAPACITY = 10;


    public MyArrayList() {
        this.array = new Object[DEFAULT_CAPACITY];
        realSize = 0;
    }


    public int size() {
        return realSize;
    }


    public boolean isEmpty() {
        if (realSize > 0) {
            return false;
        }
        return true;
    }


    public boolean contains(Object o) {
        for (int i = 0; i <realSize ; i++) {
        if (o.equals(array[i])) {
            return true;
        }
     }
            return false;
   }




        public Object[] toArray () {
            return Arrays.copyOf(array, realSize);
        }


        public boolean add (Object o){
            if (realSize == array.length) {
                array = Arrays.copyOf(array, 3 * array.length / 2 + 1);
            }
            array[realSize] = o;
            realSize++;
            return true;
        }


        public boolean remove (Object o){
            if (o == null) { //если объект равен налл, то
                for (int index = 0; index < realSize; index++) //бежим по размеру массива индексами
                    if (array[index] == null) { //если индекс =наллу
                        return true; //вернем тру
                    }
            } else {
                for (int index = 0; index < realSize; index++)
                    if (o.equals(array[index])) { //если объект равен индексу от массива
                        return true;
                    }
            }
            return false;
        }


        //public boolean addAll (Collection c){
           // if(array.length == realSize);
        //}


        public void clear () {
        if(realSize==array.length){
            realSize = array.length-realSize;
            realSize = 0;
        }
            for (int i = 0; i < realSize; i++)
                array[i] = null;
            realSize = 0;
        }


        public Object get ( int index){
            if (index >= realSize || index < 0) {
                throw new RuntimeException("false");
            }
            return array[index];
        }


        public Object set ( int index, Object element) {
                return array[index]=element;
        }



        public void add ( int index, Object element){
            if (index < 0 || index > realSize) {
                throw new RuntimeException("ошибка в" + index + " размера " + realSize);
            } else {
                if(index ==realSize){
                    element=realSize + 1;
                    realSize++;
                }
                //Arrays.(array, index, array, index + 1, realSize - index);
                array[index] = element;
                realSize++;
            }
        }



        public Object remove ( int index){
            if (index >= realSize) {
                //    throw new RuntimeException("false");
            }
            Object removElem = array[index];
            for (int i = 0; i < array.length; i++) {
//                array[i] = array[i + 1];
            }
            array[realSize - 1] = null;
            realSize--;
            return removElem;
        }


        public int indexOf (Object o){
            if (o == null) {
                for (int i = 0; i < realSize; i++)
                    if (array[i]==null)
                        return i;
            } else {
                for (int i = 0; i < realSize; i++)
                    if (o.equals(array[i]))
                        return i;
            }
            return -1;
        }


        public boolean containsAll (Collection c){
            for (int i = 0; i <realSize ; i++) {
                if (c.equals(array[i])) {
                    return true;
                }
            }
            return false;
        }


        @Override
        public String toString () {
            return "MyArrayList{" +
                    "array=" + Arrays.toString(array) +
                    ", realSize=" + realSize +
                    '}';
        }
    }


