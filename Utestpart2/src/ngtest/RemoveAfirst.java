package ngtest;

public class RemoveAfirst {
	public String removeLetterA(String chaine) {
		String nvChaine="";
		int pos=-1;
		if (chaine.length()>2) {
		pos=chaine.indexOf('A');
		if (pos==0 && chaine.charAt(1)=='A')
		nvChaine=""+chaine.substring(2);
		else if (pos==1) nvChaine=chaine.charAt(0)+chaine.substring(2);
		else nvChaine=chaine;
		}
		else if (chaine.length()==2) { // chaine = AB chaine2=BA
		pos=chaine.indexOf('A'); //pos=0
		if (pos==0) nvChaine=""+chaine.substring(1); // nvchaine=""+B
		else if (pos==1) nvChaine=""+chaine.charAt(0); //pour chaine 2=> nvchaine=""+B
		}
		return nvChaine;
		}
}
