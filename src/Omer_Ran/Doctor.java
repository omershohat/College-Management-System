package Omer_Ran;

import java.util.ArrayList;

public class Doctor extends Lecturer implements Comparable <Doctor> {
    private final ArrayList<String> articles;
    public Doctor(String name, String id, DegreeLevel degreeLevel, String major, float salary, Department department, ArrayList<String> articles) {
        super(name, id, degreeLevel, major, salary, department);
        this.articles = articles;
    }

    private String articlesDisplay() {
        sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < articles.size(); i++) {
            if (i == articles.size() - 1) {
                sb.append(articles.get(i));
            } else {
                sb.append(articles.get(i)).append(",");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public ArrayList<String> getArticles() {
        return articles;
    }

    @Override
    public String toString() {
        return super.toString() + ", articles = " + articlesDisplay();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int compareTo(Doctor o) {
        return Integer.compare(articles.size(), o.articles.size());
    }
}
