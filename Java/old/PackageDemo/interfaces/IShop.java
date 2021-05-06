package interfaces;

import java.lang.*;
import entity.*;

public interface IShop
{
	
	public Product getProduct(String productId);
	public void addProduct(Product p);
	public void removeProduct(Product p);
}