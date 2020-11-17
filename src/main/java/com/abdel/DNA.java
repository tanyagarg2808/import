package com.abdel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DNA {
	private NucleicAcid[] LtoRHelix;
	private NucleicAcid[] RtoLHelix;
	
	public DNA (String strand) {
		LtoRHelixpopulate(strand.toUpperCase());
		RtoLHelixpopulate(strand.toUpperCase());
	}
	
	public void LtoRHelixpopulate(String strand) {
		LtoRHelix = new NucleicAcid[strand.length()];
		for(int index=0; index < strand.length(); index++) {
			switch (strand.charAt(index)) {
				case 'A':
					LtoRHelix[index] = new NucleicAcid("Adenine", "C5H5N5", 135.13f, 1.6f);
					break;
				case 'T':
					LtoRHelix[index] = new NucleicAcid("Thymine", "C5H6N2O2", 126.115f, 1.223f);
					break;
				case 'C':
					LtoRHelix[index] = new NucleicAcid("Cytosine", "C4H5N3O", 111.10f, 1.55f);
					break;
				case 'G':
					LtoRHelix[index] = new NucleicAcid("Guanine", "C5H5N5O", 151.13f, 2.200f);
					break;
					
			}
		}
	}
	
	public void RtoLHelixpopulate(String strand) {
		RtoLHelix = new NucleicAcid[strand.length()];
		for(int index=0; index < strand.length(); index++) {
			switch (strand.charAt(index)) {
				case 'A':
					RtoLHelix[index] = new NucleicAcid("Thymine", "C5H6N2O2", 126.115f, 1.223f);
					break;
				case 'T':
					RtoLHelix[index] = new NucleicAcid("Adenine", "C5H5N5", 135.13f, 1.6f);
					break;
				case 'C':
					RtoLHelix[index] = new NucleicAcid("Guanine", "C5H5N5O", 151.13f, 2.200f);
					break;
				case 'G':
					RtoLHelix[index] = new NucleicAcid("Cytosine", "C4H5N3O", 111.10f, 1.55f);
					break;
					
			}
		}
	}
	
	public void print() {
		for(NucleicAcid nucleicAcid: LtoRHelix) {
			nucleicAcid.print();
		}
		for(NucleicAcid nucleicAcid: RtoLHelix) {
			nucleicAcid.print();
		}
	}
	
	public void highestMolarMass() {
		Map<String, List<Integer>> LtoRMap = new HashMap<String, List<Integer>>();
		Map<String, List<Integer>> RtoLMap = new HashMap<String, List<Integer>>();
		String highestMolasMassNucleicAcid = null;
		float highestMolarMass = 0;
		for(int i=0; i< LtoRHelix.length; i++) {
			if(LtoRMap.containsKey(LtoRHelix[i].getName())) {
				LtoRMap.get(LtoRHelix[i].getName()).add(i);
			} else {
				List<Integer> indexList = new ArrayList<Integer>();
				indexList.add(i);
				LtoRMap.put(LtoRHelix[i].getName(), indexList);
			}
			if(LtoRHelix[i].getMolarmass() > highestMolarMass) {
				highestMolarMass = LtoRHelix[i].getMolarmass();
				highestMolasMassNucleicAcid = LtoRHelix[i].getName();
			}
		}
		
		for(int i=0; i< RtoLHelix.length; i++) {
			if(RtoLMap.containsKey(RtoLHelix[i].getName())) {
				RtoLMap.get(RtoLHelix[i].getName()).add(i);
			} else {
				List<Integer> indexList = new ArrayList<Integer>();
				indexList.add(i);
				RtoLMap.put(RtoLHelix[i].getName(), indexList);
			}
			if(RtoLHelix[i].getMolarmass() > highestMolarMass) {
				highestMolarMass = RtoLHelix[i].getMolarmass();
				highestMolasMassNucleicAcid = RtoLHelix[i].getName();
			}
		}
		
		System.out.println("Nucleic Acid with Highest Molar Mass: " + highestMolasMassNucleicAcid);
		System.out.println("Molar Mass of " + highestMolasMassNucleicAcid + ": "+ highestMolarMass);
		System.out.println("Index position of " + highestMolasMassNucleicAcid + " in LtoRHelix: " + LtoRMap.get(highestMolasMassNucleicAcid).toString());
		System.out.println("Index position of " + highestMolasMassNucleicAcid + " in RtoLHelix: " + RtoLMap.get(highestMolasMassNucleicAcid).toString());
	}
	
	public void totalDensity() {
		float totalDensity = 0;
		for(NucleicAcid nucleicAcid: LtoRHelix) {
			totalDensity += nucleicAcid.getDensity();
		}
		for(NucleicAcid nucleicAcid: RtoLHelix) {
			totalDensity += nucleicAcid.getDensity();
		}
		
		System.out.println("Total density of all Nucleic Acid is : " + totalDensity);
	}
}
