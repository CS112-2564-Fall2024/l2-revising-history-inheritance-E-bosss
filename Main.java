/**
 * Main.java - Driver class to demonstrate revised historical examples
 * 
 * @author ???
 * @version ???
 */

public class Main {
	public static void main(String[] args) {
		String tulsaDescription = "A black teenager, who was working as a shoe shiner in downtown Tulsa, Oklahoma, was arrested and accused of assaulting a white woman on a public elevator in broad daylight. A group of white vigilantes, intent on lynching him, and armed black men intent on protecting him gathered at the courthouse. A shot rang out, and the violence began. The riot resulted in 35 square blocks of destruction, including more than 1,250 homes, churches, schools, businesses, a hospital, and a library.";
		Date tulsaDay = new Date(5, 31, 1921);
		HistoricalEvent tulsaRiot = new HistoricalEvent(tulsaDescription, tulsaDay);

		System.out.println("====================================================");
		System.out.println("HISTORICAL EVENT EXAMPLE:");
		System.out.println("====================================================");
		System.out.println(tulsaRiot);
		
		
		String tulsaRevised = "It started with newspaper reports that a black man had assaulted a white elevator operator. He was arrested, and black World War I vets rushed to the courthouse to prevent a lynching. Whites were deputized and handed weapons, the shooting started and then it got out of hand. It was mob rule for two days, and the result was the complete devastation of the entire black community. The white mobs looted the homes and businesses before they set fire to the community. Planes circled mid-air and bombed what was known as Black Wall Street. The National Guard was called out after the governor declared martial law, and imprisoned all blacks that were not already in jail. More than 35 blocks were destroyed, along with more than 1,200 homes, and some 300 people died, mostly Blacks.",
			tulsaCitation = "https://www.smithsonianmag.com/smithsonian-institution/long-lost-manuscript-contains-searing-eyewitness-account-tulsa-race-massacre-1921-180959251/";
		RevisedHistoricalEvent tulsaMassacre = new RevisedHistoricalEvent(tulsaDescription, tulsaDay,
			tulsaRevised, tulsaCitation);
		
		// System.out.println("\n====================================================");
		// System.out.println("REVISED HISTORICAL EVENT EXAMPLE:");
		// System.out.println("====================================================");
		// tulsaMassacre.teach();
		// System.out.println(tulsaMassacre);

		String pearlHarbor = "The bombing of Pearl Harbor marked the entry of the US into WW2. Located on the Island of Oahu, the current president FDR moved his fleet from San Diego to help prepare for conflict from the simmering tensions bewteen the US and Japan. Japan in secrecy sailed its ships across open waters to launch a suprise attack to incapacitate the american naval fleet. This worked and thus let the Japanese army make to advance much into europe and china without the worry of the US to aid in the time being";
		Date pearlHarborDate = new Date(12, 7, 1941);
		HistoricalEvent pearlHarborEvent = new HistoricalEvent(pearlHarbor, pearlHarborDate);

		String pearlHarborRevised = "Rising tensions in the Europe between its countries and Germany as well as the ongoing war bewteen China and Japan eventually led to the US getting involved. The US trying to stay neutral for as long as it could would eventaully be the target by Japan and its need to continue conquest. Japan launched a suprise attack against the US naval forces stationed in Pearl Harbor to try and weaken the US vast military might. Japans sent a large naval army across the pacific and launched an attack on december 7 of 1941 which marks the entry of the US into WW2";
		String pearlHarborCitation = "https://www.nationalww2museum.org/war/topics/pearl-harbor-december-7-1941";

		RevisedHistoricalEvent revisedPearlHarbor = new RevisedHistoricalEvent(pearlHarbor, pearlHarborDate, pearlHarborRevised, pearlHarborCitation);
		System.out.println("====================================================");	
		System.out.println("HISTORICAL EVENT EXAMPLE:");
		System.out.println("====================================================");
		System.out.println(pearlHarborEvent);

		System.out.println("\n====================================================");
		System.out.println("REVISED HISTORICAL EVENT EXAMPLE:");
		System.out.println("====================================================");
		System.out.println(revisedPearlHarbor);
	}
}