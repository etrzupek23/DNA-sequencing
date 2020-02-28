/*
This program identifies whether there is a protein in a strand of DNA
Created by Emma on Feb. 28th, 2020
Intermediate Programming - Block 8
*/
//imports ArrayList
import java.util.ArrayList;
public class DNA {
  public static void main(String[] args) {
    //to go through each strand to see if there are proteins
    for (int i = 0; i < 3; i++) {
      ArrayList<String> dnaList = new ArrayList<String>();
      //adds the strands to the array list
      dnaList.add("ATGCGATACGCTTGA");
      dnaList.add("ATGCGATACGTGA");
      dnaList.add("ATTAATATGTACTGA");
      String dna = dnaList.get(i);
      //gets the length of the strand
      int length = dna.length();
      System.out.println("Length: " + length);
      //tests to see if there is a start codon, which is ATG
      int start = dna.indexOf("ATG");
      System.out.println("Start: " + start);
      //tests to see if there is a stop codon, which is TGA
      int stop = dna.indexOf("TGA");
      System.out.println("Stop: " + stop);
      //checks if there is a protein
      if (start != -1 && stop != -1 && length % 3 == 0) {
        System.out.println("All conditions are met!");
        String protein = dna.substring(start, stop+3);
        System.out.println("Protein: " + protein + "\n");
      } else {
        System.out.println("No protein" + "\n");
      }
    }
  }
}
