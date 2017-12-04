package interfacagrafica;
import java.util.ArrayList;
import java.util.List;  
import javax.swing.table.AbstractTableModel;  
import ClassesPrincipais.Vagao;
  
public class TableModel extends AbstractTableModel {  
  
  
    private ArrayList<Vagao> vagoestable;

	public TableModel(ArrayList<Vagao> vagoestable) {  
        this.vagoestable = vagoestable;  
    }  
  
    @Override  
    public int getColumnCount() {  
        // TODO Auto-generated method stub  
        return 2;  
    }  
    public ArrayList<Vagao> getVagoestable() {
		return vagoestable;
	}

	public void setVagoestable(ArrayList<Vagao> vagoestable) {
		this.vagoestable = vagoestable;
	}

	@Override  
    public int getRowCount() {  
        // TODO Auto-generated method stub  
        return vagoestable.size();  
    }  
  
    @Override  
    public Object getValueAt(int rowIndex, int columnIndex) {  
        // TODO Auto-generated method stub  
        Vagao n = vagoestable.get(rowIndex);  
        char tipo, subtipo, bitola;
        switch (columnIndex) {  
        case 0:  
        	tipo=n.getTipo();
        	subtipo= n.getSubtipo();
        	bitola=n.getBitola();
            return (String.valueOf(tipo)+ String.valueOf(subtipo)+ String.valueOf(bitola));  
        case 1:  
            return n.getProprietario();  
        }  
        return null;  
    }  
  
}  
