package springboot.bogo.demo.services;

import java.util.List;

public class BOGOResponse {
	 private List<Integer> Discounted_Items;
	    private List<Integer> Payable_Items;

	    public BOGOResponse(List<Integer> Discounted_Items, List<Integer> Payable_Items) {  
	        this.Discounted_Items = Discounted_Items;
	        this.Payable_Items = Payable_Items;
	    }

	    public List<Integer> getFreeItems() {
	        return Discounted_Items;
	    }

	    public List<Integer> getPayableItems() {
	        return Payable_Items;
	    }
}
