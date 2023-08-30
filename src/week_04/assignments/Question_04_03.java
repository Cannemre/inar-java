package week_04.assignments;

public class Question_04_03 {
    public static void main(String[] args) {
        double atlantaY = -84.3879824;
        atlantaY = Math.toRadians(atlantaY);
        double atlantaX = 33.7489954;
        atlantaX = Math.toRadians(atlantaX);
        double orlandoY = -81.3792364999;
        orlandoY = Math.toRadians(orlandoY);
        double orlandoX = 28.5383355;
        orlandoX = Math.toRadians(orlandoX);
        double savannahY = -81.09983419999998;
        savannahY = Math.toRadians(savannahY);
        double savannahX = 32.0835407;
        savannahX = Math.toRadians(savannahX);
        double charlotteY = -80.84312669999997;
        charlotteY = Math.toRadians(charlotteY);
        double charlotteX = 35.2270869;
        charlotteX = Math.toRadians(charlotteX);
        double radius = 6371.01;
        double dOrlandoSavannah = radius * Math.acos(Math.sin(orlandoX) * Math.sin(savannahX) + Math.cos(orlandoX) * Math.cos(savannahX) * Math.cos(orlandoY-savannahY));
        double dSavannahCharlotte = radius * Math.acos(Math.sin(savannahX) * Math.sin(charlotteX) + Math.cos(savannahX) * Math.cos(charlotteX) * Math.cos(savannahY-charlotteY));
        double dCharlotteAtlanta = radius * Math.acos(Math.sin(charlotteX) * Math.sin(atlantaX) + Math.cos(charlotteX) * Math.cos(atlantaX) * Math.cos(charlotteY-atlantaY));
        double dAtlantaOrlando = radius * Math.acos(Math.sin(atlantaX) * Math.sin(orlandoX) + Math.cos(atlantaX) * Math.cos(orlandoX) * Math.cos(atlantaY-orlandoY));
        double dSavannahAtlanta = radius * Math.acos(Math.sin(savannahX) * Math.sin(atlantaX) + Math.cos(savannahX) * Math.cos(atlantaX) * Math.cos(savannahY-atlantaY));
        double triangle1 = (dOrlandoSavannah + dAtlantaOrlando + dSavannahAtlanta) / 2;
        double triangle2 = (dSavannahCharlotte + dCharlotteAtlanta + dSavannahAtlanta) / 2;
        double areaTriangle1 = Math.sqrt(triangle1 * (triangle1 - dOrlandoSavannah) * (triangle1 - dAtlantaOrlando) * (triangle1 - dSavannahAtlanta));
        double areaTriangle2 = Math.sqrt(triangle2 * (triangle2 - dSavannahCharlotte) * (triangle2 - dCharlotteAtlanta) * (triangle2 - dSavannahAtlanta));
        double area = areaTriangle1 + areaTriangle2;
        System.out.println("Estimated area enclosed by these four cities: " + area);

    }
}
