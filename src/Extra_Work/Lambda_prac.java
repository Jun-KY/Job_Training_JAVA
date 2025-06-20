package Extra_Work;

public class Lambda_prac {
        interface OnClickListener {//인터페이스를 만들고 class를 통해 실행
            void onClick();
        }

        private OnClickListener listener; // 구현체를 실제 저장할 필드

        public void setOnClickListener(OnClickListener listener) {
            this.listener = listener;
        }

        public void click() {
            if (listener != null) {
                listener.onClick();
            }
        }

        // 내부 클래스: 외부와 강하게 결합되지 않음
        private class ClickHandler implements OnClickListener {
            public void onClick() {
                System.out.println("Button was clicked!");
            }
        }

        public void simulate() {
            setOnClickListener(new ClickHandler());
            click();
        }

        public static void main(String[] args) {
            Lambda_prac btn = new Lambda_prac();
            btn.simulate();
        }

}
