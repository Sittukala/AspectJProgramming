package gendev.hw2.fm;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Test;

import gendev.hw2.ProductBacklog;

class FeatureTest {

	@Test
	void testProducts() {
		FeatureModel fm = new Ssa46FeatureModel();

		System.out.println(fm);
		

		for (int i = 0; i < 5; i++) {
			Set<String> product = ProductBacklog.getNextProduct(fm);
			System.out.println("Checking product " + product);
			assertTrue(fm.isProduct(product));
			// Note: This test might fail sometimes after implementing Task4. 
		}
	}
	
	
	@Test
	void testEmpty() {
		FeatureModel fm = new Ssa46FeatureModel();
		assertFalse(fm.isProduct(new HashSet<String>()));
	}
}
