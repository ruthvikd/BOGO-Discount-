package springboot.bogo.demo.services;

import java.util.List;
public interface BOGOService {		
BOGOResponse calculateDiscounts(List<Integer> prices);
}
