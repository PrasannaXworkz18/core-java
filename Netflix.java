class Netflix{

 static String kanndaMovies[] = {"KGF Chapter 2" , " Gandhada Gudi" , "Kantara" , "KGF Chapter 1" , "777 Charlie" , "RangiTaranga" , "Lucia" , "Ulidavaru Kandanthe" , "Uppi 2" , "Garuda Gamana Vrishabha Vahana" , "Kirik Party" , "James" , "Love Mocktail" , "Raajakumara" , "Ratnan Prapancha" , "Mungaru Male" , "Mungaru Male" , "Ugramm" , "U Turn" ,  "Kavaludaari" , "Thithi" , "Super" , "Simple Agi Ondh Love Story" , "Bell Bottom" , "Mr. And Mrs. Ramchari"};
 
 static String englishSeries[] = {"Fast And Furious" , "Stranger Things" , "Naruto" , "GOT" , "LRP" , "Sex Education" , "Peaky Blinder" , "Z Nation" , "All Of Us Are Dead" , "Kobra Kai" , "Breaking Bad" , "Boardwalk Empire" , "Money Heist" , "Hannibal" , "True Detective " , "House Of Dragon" , "Sherlock " , "House of Cards " , "Squide Game" , "Luther "};
 
 static String hindiSeries[] = {"Scam 1992" , "Mirzapur" , "Farzi" , "Aspirants" , "The Family Man" , "Sacred Games" , "Kota Factory" , "Aarya" , "Special Ops" , "Criminal Justice" , "Paatal Lok" , "Asur" , "Panchayat" , "Inside Edge" , "Little Things"};
 
 static String teluguMovies[] = {"Baahubali: The Beginning " , " Baahubali 2:The Conclusion " , "C/o Kancharapalem" , "Mahanati " , "Arjun Reddy " , "Brochevarevarura " , "Kanche " , "Swamy Ra Ra " , "Fidaa " , "Ala Modalaindi " , "Krishna Gaadi Veera Prema Gaadha " , "Khaleja" , "Nenokkadine " , " Leader " , "Eega " , "Mithunam" , "Pelli Choopulu " , "Oopiri" , "All of Us" , "Prema Katha Chitram "};
 
 static String malayalamMovies[] = {"Kumbalangi Nights" , "Sudani from Nigeria" , "Munnariyippu " , "The Great Indian Kitchen" , "Jallikattu" , "Sexy Durga" , "Vadakkunokkiyantram" , "Amma Ariyan" , "Maheshinte Prathikaaram" , "Nadodikkattu" , "Thalayana Manthram" , "Kireedam" , "Thaniyavarthanam" , "Peruvazhiyambalam" , "Thoovanathumbikal" , "Prayanam" , "Vaishali" , "Yavanika" , "Irakal " , "Vanaprastham" , "Piravi" , "Pokkuveyil" , " Esthappan" , "Anantaram" , "Vidheyan"};
 

public static void main(String args[]){

System.out.println("Main Started");

System.out.println("------------------------------------------------------------------------------------------------------------------------");
for (int pk=0;pk<kanndaMovies.length;pk++)
{
	System.out.println(kanndaMovies[pk]);
}
for (int pk=kanndaMovies.length-1;pk>=0;pk--)
{
	System.out.println(kanndaMovies[pk]);
}

System.out.println("------------------------------------------------------------------------------------------------------------------------");
for (int object=0;object<englishSeries.length;object++)
{
	System.out.println(englishSeries[object]);
}
for (int object=englishSeries.length-1;object>=0;object--)
{
	System.out.println(englishSeries[object]);
}

System.out.println("------------------------------------------------------------------------------------------------------------------------");
for (int index=0;index<hindiSeries.length;index++)
{
	System.out.println(hindiSeries[index]);
}
for (int index=hindiSeries.length-1;index>=0;index--)
{
	System.out.println(hindiSeries[index]);
}

System.out.println("------------------------------------------------------------------------------------------------------------------------");
for (int prasanna=0;prasanna<teluguMovies.length;prasanna++)
{
	System.out.println(teluguMovies[prasanna]);
}
for (int prasanna=teluguMovies.length-1;prasanna>=0;prasanna--)
{
	System.out.println(teluguMovies[prasanna]);
}

System.out.println("------------------------------------------------------------------------------------------------------------------------");
for (int kumar=0;kumar<malayalamMovies.length;kumar++)
{
	System.out.println(malayalamMovies[kumar]);
}
for (int kumar=malayalamMovies.length-1;kumar>=0;kumar--)
{
	System.out.println(malayalamMovies[kumar]);
}

System.out.println("------------------------------------------------------------------------------------------------------------------------");

System.out.println("Main Ended");

                                                   }
                }