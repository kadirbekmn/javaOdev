
public class Select {

//	select ContactName Adi, CompanyName SirketAdi, City Sehir from Customers
//	
//	select * from Customers where City = 'Berlin'
//	
//	--case insentitive
//	
//	select * from Products where categoryId = 1 or categoryId = 3
//	
//	select * from Products where categoryId = 1 or unitPrice >= 10
//	
//	select * from Products where categoryId = 1 order by unitPrice desc  --ascending --descending
//	
//	select count(*) Adet from Products where CategoryId = 2
//	
//	select categoryId, count(*) from Products where unitprice > 20 group by CategoryId having count(*) < 10
//	
//	select Products.ProductId, Products.productName, products.Unitprice, categories.categoryname 
//	from products inner join Categories on Products.CategoryId = categories.categorryId where products.unitprice > 10
//	
//	--DTO Data Transformation Object
//	
//	select * from Products p inner join OrderDetails od on p.productId = od.ProductId inner join Orders o 
//	on o.OrderId = od.OrderId
//
//	select * from Customers c left join Orders o on c.CustomerId = o.CustomerId where o.CustomerId is null


	
	
}
