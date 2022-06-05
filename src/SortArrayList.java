import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortArrayList extends SciencetificCalculator{
	

	public SortArrayList() {
		super();
		// TODO Auto-generated constructor stub
	}
	//TODO we can use lınkedlist or HashMap
	static List<Double> list=new ArrayList<>();
	public static List<Double> addList(){
	    int x;
		System.out.println("how many double elemtns do yu wanna put in list ");
		x=scan.nextInt();
		for (int i=0;i<x;i++) {
			double doubs=scan.nextDouble();
			list.add(doubs);
		}
		return list;
	}

	public static List <Double> sort() {
		addList().stream().sorted().forEach(t->System.out.print(t+" "));
		return list;
	}
	public static List <Double> reverseSort(){
	 addList().stream().sorted(Comparator.reverseOrder()).forEach(t->System.out.print(t+ " "));
		return list ;
	}
	
}
