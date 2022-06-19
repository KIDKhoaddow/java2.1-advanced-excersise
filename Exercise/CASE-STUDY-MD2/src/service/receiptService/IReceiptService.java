package service.receiptService;

import model.Receipt;
import service.IGenericService;

public interface IReceiptService extends IGenericService<Receipt> {
    int getNumberReceipt();

}
