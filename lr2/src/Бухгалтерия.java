import java.util.Hashtable;
import java.util.Map;
import java.util.Optional;
import java.util.Vector;

public class Бухгалтерия {
    Hashtable<Клиент, Vector<Object>> услуги =
            new Hashtable<>();

    private Бухгалтерия() {  }

    public static Бухгалтерия Инициализация(){
        Бухгалтерия res = new Бухгалтерия();
        Клиент новый = new Клиент();
        новый.Id = "ИНС-19-1";
        новый.Name = "Ислам";
        новый.SurName = "Абдуразаков";
        новый.pass = "1488";

        res.услуги.put(
                новый,
                new Vector<>()
        );
        новый = new Клиент();
        новый.Id = "ИНС-19-1";
        новый.Name = "Евгений";
        новый.SurName = "Нколаев";
        новый.pass = "Иванович";
        res.услуги.put(
                новый,
                new Vector<>()
        );
        return res;
    }

    public void ОказаниеУслуг(String кодУслуги, Клиент клиент){
        Optional<Map.Entry<Клиент, Vector<Object>>> find =
                услуги.entrySet().stream()
                .filter(e->e.getKey().Id.equals(кодУслуги)).findFirst();
        if(find.isPresent()){
            System.out.println("Услуга зафиксрована. ");
        }
        else
            System.out.println("Услуга не зафиксирована");
    }

    public void Каталог(){
        услуги.entrySet().stream().forEach(e ->{
            Услуга tek = e.getKey();
            System.out.println(tek.кодУслуги + "\n" + tek.типУслуги + "\n" + tek.датаУслги + "\n");

        });
    }



}
