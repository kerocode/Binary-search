/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarysearch;

/**
 *
 * @author Mr.keroles
 *
 */
import java.util.Arrays;
import java.util.NoSuchElementException;

/**
 * Class BinaryHeap *
 */


public class BinaryHeap<AnyType extends Comparable<AnyType>>
{
   private static final int CAPACITY = 2;

   private int size;            // Number of elements in heap
   private AnyType[] heap;     // The heap array

   public BinaryHeap()
   {
      size = 0;
      heap = (AnyType[]) new Comparable[CAPACITY];
   }

 /**
  * Construct the binary heap given an array of items.
  */
   public BinaryHeap(AnyType[] array)
   {
      size = array.length;
      heap = (AnyType[]) new Comparable[array.length+1];

      System.arraycopy(array, 0, heap, 1, array.length);//we do not use 0 index

      buildHeap();
   }
 /**
  *   runs at O(size)
  */
   private void buildHeap()
   {
      for (int k = size/2; k > 0; k--)
      {
         percolatingDown(k);
      }
   }
   private void percolatingDown(int k)
   {
      AnyType tmp = heap[k];
      int child;

      for(; 2*k <= size; k = child)
      {
         child = 2*k;

         if(child != size &&
            heap[child].compareTo(heap[child + 1]) > 0) child++;

         if(tmp.compareTo(heap[child]) > 0)  heap[k] = heap[child];
         else
                break;
      }
      heap[k] = tmp;
   }

 /**
  *  Sorts a given array of items.
  */
   public void heapSort(AnyType[] array)
   {
      size = array.length;
      heap = (AnyType[]) new Comparable[size+1];
      System.arraycopy(array, 0, heap, 1, size);
      buildHeap();

      for (int i = size; i > 0; i--)
      {
         AnyType tmp = heap[i]; //move top item to the end of the heap array
         heap[i] = heap[1];
         heap[1] = tmp;
         size--;
         percolatingDown(1);
      }
      for(int k = 0; k < heap.length-1; k++)
         array[k] = heap[heap.length - 1 - k];
   }

 /**
  * Deletes the top item
  */
   public AnyType deleteMin() throws RuntimeException
   {
      if (size == 0) throw new RuntimeException();
      AnyType min = heap[1];
      heap[1] = heap[size--];
      percolatingDown(1);
      return min;
	}

 /**
  * Inserts a new item
  */
   public void insert(AnyType x)
   {
      if(size == heap.length - 1) doubleSize();

      //Insert a new item to the end of the array
      int pos = ++size;

      //Percolate up
      for(; pos > 1 && x.compareTo(heap[pos/2]) < 0; pos = pos/2 )
         heap[pos] = heap[pos/2];

      heap[pos] = x;
   }
   private void doubleSize()
   {
      AnyType [] old = heap;
      heap = (AnyType []) new Comparable[heap.length * 2];
      System.arraycopy(old, 1, heap, 1, size);
   }

   public String toString()
   {
      String out = "";
      for(int k = 1; k <= size; k++) out += heap[k]+" ";
      return out;
   }
  
public void whiteSpace(int i){
    for (int j=0; j<i;j++){
    System.out.print(" ");
    
    }

}
    public void PheapTree() {
       
        whiteSpace(64);
        System.out.print(heap[1] + "\n");
        whiteSpace(63);
        System.out.print("/ \\\n");
        for (int k = 2; k < 16; k += 2) {
            whiteSpace(64 - k);
            System.out.print("/");
            whiteSpace((2 * k) - 1);
            System.out.print("\\\n");
        }

        whiteSpace(49);
        System.out.print(heap[2]);
        whiteSpace(29);
        System.out.print(heap[3] + "\n");
        whiteSpace(48);
        System.out.print("/");
        System.out.print("\\");
        whiteSpace(28);
        System.out.print("/");
        System.out.print("\\\n");
        whiteSpace(47);
        System.out.print("/ ");
        System.out.print(" \\");
        whiteSpace(26);
        System.out.print("/ ");
        System.out.print(" \\\n");
        whiteSpace(46);
        System.out.print("/  ");
        System.out.print("  \\");
        whiteSpace(24);
        System.out.print("/  ");
        System.out.print("  \\\n");
        whiteSpace(45);
        System.out.print("/    ");
        System.out.print("  \\");
        whiteSpace(22);
        System.out.print("/    ");
        System.out.print("  \\\n");
        whiteSpace(44);
        System.out.print(heap[4]);
        whiteSpace(6);
        System.out.print(heap[5]);
        whiteSpace(20);
        System.out.print(heap[6]);
        whiteSpace(6);
        System.out.print(heap[7] + "\n");

        for (int i = 0; i < 3; i++) {
            whiteSpace(44);
            System.out.print("|");
            whiteSpace(6);
            System.out.print("|");
            whiteSpace(22);
            System.out.print("|");
            whiteSpace(6);
            System.out.print("|\n");
        }

        whiteSpace(32);
        System.out.print("|------|----/");
        whiteSpace(6);
        System.out.print("\\----|-----|");
        whiteSpace(4);
        System.out.print("|----|-/");
        whiteSpace(6);
        System.out.print("\\-----|-------|");
        for (int i = 0; i < 4; i++) {
            whiteSpace(32);
            System.out.print("|");
            whiteSpace(6);
            System.out.print("|");
            whiteSpace(16);
            System.out.print("|");
            whiteSpace(5);
            System.out.print("|");
            whiteSpace(4);
            System.out.print("|");
            whiteSpace(4);
            System.out.print("|");
            whiteSpace(14);
            System.out.print("|");
            whiteSpace(7);
            System.out.print("|\n");
        }
        whiteSpace(32);
        System.out.print(heap[8]);
        whiteSpace(5);
        System.out.print(heap[9]);
        whiteSpace(15);
        System.out.print(heap[10]);
        whiteSpace(4);
        System.out.print(heap[11]);
        whiteSpace(2);
        System.out.print(heap[12]);
        whiteSpace(3);
        System.out.print(heap[13]);
        whiteSpace(13);
        System.out.print(heap[14]);
        whiteSpace(6);
        System.out.print(heap[15] + "\n");
        whiteSpace(17);
        System.out.print("|-------|------/");
        whiteSpace(6);
        System.out.print("\\---|----|");
        whiteSpace(7);
        System.out.print("|");
        whiteSpace(5);
        System.out.print("|\n");
        for (int j = 0; j < 4; j++) {
            whiteSpace(17);
            System.out.print("|");
            whiteSpace(7);
            System.out.print("|");
            whiteSpace(17);
            System.out.print("|");
            whiteSpace(4);
            System.out.print("|");
            whiteSpace(7);
            System.out.print("|");
            whiteSpace(5);
            System.out.print("|\n");
        }
        whiteSpace(17);
        System.out.print(heap[16]);
        whiteSpace(6);
        System.out.print(heap[17]);
        whiteSpace(15);
        System.out.print(heap[18]);
        whiteSpace(4);
        System.out.print(heap[19]);
        whiteSpace(6);
        System.out.print("|     |");
        for (int k = 0; k < 4; k++) {
            whiteSpace(56);
            System.out.print("|");
            whiteSpace(5);
            System.out.print("|\n");

        }
        whiteSpace(41);
        System.out.print("|-------|------/");
        whiteSpace(5);
        System.out.print("\\---|----|");
        for (int g = 0; g < 3; g++) {
            whiteSpace(41);
            System.out.print("|");
            whiteSpace(7);
            System.out.print("|");
            whiteSpace(16);
            System.out.print("|");
            whiteSpace(4);
            System.out.print("|\n");
        }
        whiteSpace(41);
        System.out.print(heap[20]);
        whiteSpace(7);
        System.out.print(heap[21]);
        whiteSpace(16);
        System.out.print(heap[22]);
        whiteSpace(4);
        System.out.print(heap[23]+"\n");
    }
}
