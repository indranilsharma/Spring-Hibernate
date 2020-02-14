package com.mypack;

import java.util.Date;

import org.hibernate.Session;

import com.mypack.common.Stock;
import com.mypack.common.StockDetail;
import com.mypack.persistence.HibernateUtil;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Maven + Hibernate One-to-One example + MySQL");
        Session session = HibernateUtil.getSessionFactory().openSession();
        
        session.beginTransaction();
        
        Stock stock = new Stock();
        
        stock.setStockCode("4715");
        stock.setStockName("GENM");
     
        StockDetail stockDetail = new StockDetail();
        stockDetail.setCompName("GENTING Malaysia");
        stockDetail.setCompDesc("Best resort in the world");
        stockDetail.setListedDate(new Date());
        
        stock.setStockDetail(stockDetail);
        stockDetail.setStock(stock);
        
        session.save(stock);

        session.getTransaction().commit();
        
        
    }
}

