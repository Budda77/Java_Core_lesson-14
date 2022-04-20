package ua.lviv.lgs.homework.commodity;

import java.util.Comparator;

public class CommodityWeigthComparator implements Comparator<Commodity>{

	@Override
	public int compare(Commodity o, Commodity o1) {
		
		return o.getWeigthOfItem() > o1.getWeigthOfItem()?1:-1;
	}

}
