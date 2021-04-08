package demo13;

// switch
public class switchDemo {
    public static void main(String[] args) {
        int n = 10;
        String str = n + "对应的中文数字是";

        switch (n) {
            case 1:
                str += '壹';
                break;
            case 2:
                str +='贰';
                break;
            case 3:
                str += '叁';
                break;
            case 4:
                str +='肆';
                break;
            case 5:
                str +='伍';
                break;
            case 6:
                str +='陆';
                break;
            case 7:
                str +='柒';
                break;
            case 8:
                str +='捌';
                break;
            case 9:
                str +='玖';
                break;
            default:
                str = "你输入的数字是错误的！";
                break;
        }
        System.out.println(str);
    }
}
