import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DataSource {

    public static List<DataSet> getDataSets() {
        List<DataSet> dataSetList = new ArrayList<>();
        initiateData().forEach(t -> dataSetList.add(new DataSet(parseName(t), parseKeywords(t))));
        return dataSetList;
    }

    public static List<String> getListOfCategoryNames() {
        List<String> listOfCategoryNames = new ArrayList<>();
        initiateData().forEach(t -> listOfCategoryNames.add(parseName(t)));
        return listOfCategoryNames;
    }

    private static String parseName(String rawString) {
        return rawString.substring(0, rawString.indexOf('\t'));
    }

    private static List<String> parseKeywords(String rawString) {
        return Arrays.asList(
                rawString.substring(rawString.indexOf('\t') + 1)
                        .split(", "));
    }

    private static List<String> initiateData() {
        List<String> rawData = new ArrayList<>();
        rawData.add("Продукты\tспар, еда, фрукты, овощи, продукты, азбука, перекресток, питание, еда, хлеб, мороженое, вода, сок, продукты, киб, молоко, печеньки, кефир, лента, глобус, ашан");
        rawData.add("Транспорт\tсамолет, метро, такси, электричка, жд, трамвай, тройка, дорога, автобус, проезд, маршрутка, самокат, велосипед, бензин, заправка, парковка, стоянка, дизель");
        rawData.add("Развлечения\tбухалово, кино, театр, клуб, бухло, алкоголь, игра, стим, vr");
        rawData.add("Подарки\tцветы, др, открытка, подарок");
        rawData.add("Одежда, обувь и прочие аксессуары\tкроссовки, обувь, футболка, одежка, куртка, шапка, одежда");
        rawData.add("Образование\tкурсы, книги, вебинар, тренинг, книга");
        rawData.add("бизнес\tбизнес, закупка материалов");
        rawData.add("Кафе и рестораны\tмакдак, кфс, кинг, бар, паб, ресторан, доставка, кафе, чаевые, чай, соль");
        rawData.add("Здоровье и фитнес\tабонемент, тренажерка, качалка, спорт, йога");
        rawData.add("Дети\tдочь, сын, садик, школа, репетитор");
        rawData.add("Зарплата\tзп, зарплата");
        rawData.add("Жилье\tквартира, съем, бауцентр, длядома, бытовуха, посуда, икеа, дом");
        rawData.add("ЖКХ\t электричество, интернет, инет");
        rawData.add("Медицина\tврач, стоматолог, обследование, анализы, аптека, стоматология, больница");
        rawData.add("Подписки\tподписка, телефон, нетфликс, ростелеком, ютуб, хероку, мобс");
        rawData.add("Красота\tкрем,  духи, подружка, салон, парикмахерская, летуаль, кремасики");
        rawData.add("Стриминг\tтвич, донаты, dontaionalerts, бусти");
        rawData.add("Напитки\tпепси, кола, чай, сок");
        rawData.add("Животные \tпатрик, фиби, собаки");
        rawData.add("курилка\tвейп, кальян");
        rawData.add("Проценты на остаток\tпроценты, остаток");
        rawData.add("кешбек\tкэшбэк, кешбэк, кэшбек, кешбек");
        rawData.add("Хобби\tиголочка, леонардо, барабаны");
        rawData.add("Путешествия\tотпуск, экскурсия, туалет");
        rawData.add("Прочие доходы\tподарили");
        rawData.add("машина\tавтосервис, ремонт машины, запчасти, то, осаго");
        return rawData;
    }

    public static void main(String[] args) {

        System.out.println(initiateData().get(0));
        System.out.println(parseName(initiateData().get(0)));
        System.out.println(parseKeywords(initiateData().get(0)).get(0));
        System.out.println(getListOfCategoryNames().get(0));
        System.out.println(getDataSets().get(0).toString());

    }
}
