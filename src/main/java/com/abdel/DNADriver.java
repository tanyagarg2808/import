package com.abdel;

public class DNADriver {
	public static void main(String[] args) {
		
		DNA[] inputDNA = new DNA[] {new DNA("AGCCTAGGATCAG"), new DNA("AGCCTAGGATCTAGGATCAG"), new DNA("AGCCTATAGGATCAG"), new DNA("AAAGCCTAGGATAGGATCAG"), new DNA("AAAGCCTCTGAGGATAGGATCAG")};
		for(DNA dna: inputDNA) {
			dna.print();
			System.out.println();
			dna.highestMolarMass();
			System.out.println();
			dna.totalDensity();
			System.out.println();
			System.out.println("hello world");
		}
	}
}
