package poo;
import java.util.ArrayList;
import java.util.List;  
import javax.swing.table.AbstractTableModel;  
import poo.Locomotiva;
  
public class TableModelLocomotivas extends AbstractTableModel {  
  
  
    private ArrayList<Locomotiva> locomotivastable;

	public TableModelLocomotivas(ArrayList<Locomotiva> locomotivastable) {  
        this.locomotivastable = locomotivastable;  
    }  
  
    @Override  
    public int getColumnCount() {  
        // TODO Auto-generated method stub  
        return 2;  
    }  
    public ArrayList<Locomotiva> getLocomotivastable() {
		return locomotivastable;
	}

	public void setLomocotivastable(ArrayList<Vagao> vagoestable) {
		this.locomotivastable = locomotivastable;
	}

	@Override  
    public int getRowCount() {  
        // TODO Auto-generated method stub  
        return locomotivastable.size();  
    }  
  
    @Override  
    public Object getValueAt(int rowIndex, int columnIndex) {  
        // TODO Auto-generated method stub  
        Locomotiva n = locomotivastable.get(rowIndex);  
        int classe;
        String descricao;
        double bitola, comprimentoLocomotiva;
        switch (columnIndex) {  
        case 0:  
        	classe=n.getClasse();
        	descricao= n.getDescricao();
        	bitola= n.getBitola();
            return (String.valueOf(classe)+ String.valueOf(descricao)+ String.valueOf(bitola));  
        case 1:  
            return n.getComprimentoLocomotiva();  
        }  
        return null;  
    }  
  
}  