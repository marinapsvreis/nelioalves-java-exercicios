package testandoPredicados.util;

import java.util.function.Predicate;

import testandoPredicados.Product;

public class ProductPredicate implements Predicate<Product>{

	@Override
	public boolean test(Product p) {
		return p.getPrice() >= 100.00;
	}

}
