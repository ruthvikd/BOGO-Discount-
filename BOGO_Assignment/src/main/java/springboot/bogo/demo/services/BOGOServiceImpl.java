package springboot.bogo.demo.services;

import java.util.*;
import org.springframework.stereotype.Service;

import springboot.bogo.demo.exception.BOGOException;

@Service
public class BOGOServiceImpl implements BOGOService{

	@Override
	public BOGOResponse calculateDiscounts(List<Integer> prices) {
		
		if (prices == null || prices.isEmpty()) {
            throw new BOGOException("Price list cannot be empty.");
        }
		
		

		if (prices.stream().anyMatch(price -> price < 0)) {
            throw new BOGOException("Negative numbers are not allowed. Please remove them from the list.");
        }  
		
		Collections.sort(prices, Collections.reverseOrder());

        List<Integer> Discounted_Items = new ArrayList<>();
        List<Integer> Payable_Items = new ArrayList<>();

        for (int i = 0; i < prices.size(); i++) {
        	Payable_Items.add(prices.get(i));
            if (i + 1 < prices.size()) {
            	Discounted_Items.add(prices.get(i + 1));
                i++; // Skip the next item since it's given for free
            }
        }
		return new BOGOResponse(Discounted_Items, Payable_Items);
	}
	
}
