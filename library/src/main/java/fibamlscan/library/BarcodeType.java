package fibamlscan.library;

import com.google.firebase.ml.vision.barcode.FirebaseVisionBarcode;

public enum BarcodeType {
    UNKNOWN(FirebaseVisionBarcode.FORMAT_UNKNOWN),
    ALL_FORMATS(FirebaseVisionBarcode.FORMAT_ALL_FORMATS),
    CODE_128(FirebaseVisionBarcode.FORMAT_CODE_128),
    CODE_39(FirebaseVisionBarcode.FORMAT_CODE_39),
    CODE_93(FirebaseVisionBarcode.FORMAT_CODE_93),
    CODABAR(FirebaseVisionBarcode.FORMAT_CODABAR),
    DATA_MATRIX(FirebaseVisionBarcode.FORMAT_DATA_MATRIX),
    EAN_13(FirebaseVisionBarcode.FORMAT_EAN_13),
    EAN_8(FirebaseVisionBarcode.FORMAT_EAN_8),
    ITF(FirebaseVisionBarcode.FORMAT_ITF),
    QR_CODE(FirebaseVisionBarcode.FORMAT_QR_CODE),
    UPC_A(FirebaseVisionBarcode.FORMAT_UPC_A),
    UPC_E(FirebaseVisionBarcode.FORMAT_UPC_E),
    PDF417(FirebaseVisionBarcode.FORMAT_PDF417),
    AZTEC(FirebaseVisionBarcode.FORMAT_AZTEC),
    ;
    public final int type;
    BarcodeType(int type){
        this.type = type;
    }
}
