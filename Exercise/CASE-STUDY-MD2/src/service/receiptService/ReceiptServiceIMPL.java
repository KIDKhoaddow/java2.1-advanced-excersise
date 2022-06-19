package service.receiptService;

import model.Receipt;

import java.util.List;

public class ReceiptServiceIMPL implements IReceiptService {

    public static String PATH_RECEIPT ;


    public static List<Receipt> receiptList;

    @Override
    public int getNumberReceipt() {
        return receiptList.size();
    }

    @Override
    public List<Receipt> findAll() {
        return receiptList;
    }

    @Override
    public Receipt findById(int id) {
        for (Receipt element:receiptList) {
            if(element.getReceiptId()==id){
                return element;
            }
        }
        return null;
    }

    @Override
    public void save(Receipt receipt) {
        receiptList.add(receipt);
    }

    @Override
    public void deleteById(int id) {
        System.out.println(receiptList.remove(receiptList.indexOf( findById(id))));
    }

    @Override
    public void editById(int id) {

    }

    @Override
    public void dispById(int id) {
        System.out.println(findById(id));
    }

    @Override
    public void dispAll() {
        for (Receipt element:receiptList) {
            System.out.println(element);
        }
    }
}
