import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class controllercalculator implements ActionListener {

    private viewscalculator vc;
    private modelsclac mc;

    public controllercalculator(viewscalculator vc, modelsclac mc){
        this.vc =vc;
        this.mc = mc;

        vc.ADD.addActionListener(this);
        vc.SUB.addActionListener(this);
        vc.MULTI.addActionListener(this);
        vc.DIV.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        double a = Double.parseDouble(vc.txta.getText());
        double b = Double.parseDouble(vc.txtb.getText());
          double result = 0;
        if(e.getSource() == vc.ADD)
            result =mc.add(a, b);
        else if(e.getSource() == vc.SUB)
            result =mc.sub(a, b);
        else if(e.getSource() == vc.MULTI)
            result =mc.mul(a, b);
        else if(e.getSource() == vc.DIV)
            result =mc.div(a, b);

          vc.txtresult.setText(String.valueOf(result));
    }

    
}
