package J25_06_16;

public class Button {
    interface OnClickListener{
        void onClick();
    }

    private OnClickListener listener;

    public void setListener(OnClickListener listener) {
        this.listener = listener;
    }

    public void click(){
        if (listener != null){
            listener.onClick();
        }
    }

    private class ClickHandler implements OnClickListener{
        @Override
        public void onClick() {
            System.out.println("Button was clicked.");
        }
    }

    public void simulate(){
        setListener(new ClickHandler());
        click();
    }

    public static void main (String[] args){
        Button btn = new Button();
        btn.simulate();
    }
}
