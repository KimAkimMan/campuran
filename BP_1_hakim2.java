public class BP_1_hakim2 {
    int bil1,bil2,hasil;
    bil1=Integer.parseint(textField1.getText());
    bil2=Integer.parseint(textField2.getText());

    if(textField3.getText().equals("+")){
        hasil=bil1+bil2;
        textField4.setText(String.valueOf(hasil));
    }
    else if (textField3.getText().equals("-")){
        hasil = bil1-bil2;
        textField4.setText (String.valueOf(hasil));
    }
    else if (textField3.getText().equals("*")){
        hasil = bil1*bil2;
        textField4.setText (String.valueOf(hasil));
    }
    else if (textField3.getText().equals("/")){
        hasil = bil1/bil2;
        textField4.setText (String.valueOf(hasil));
    }
}
