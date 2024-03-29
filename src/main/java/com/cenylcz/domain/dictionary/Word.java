package com.cenylcz.domain.dictionary;

import com.cenylcz.Model;
import com.cenylcz.constant.Alphabet;
import com.cenylcz.constant.Category;
import javax.persistence.*;

@Entity
@Table(name = "words", schema = "cenylcz")
public class Word extends Model  {

    @Id
    @Column(name = "word", unique = true, nullable = false)
    private String word;

    @Column(name = "definition", nullable = false)
    private String definition;

    @Column(name = "example", nullable = true)
    private String example;

    @Enumerated(EnumType.STRING)
    @Column(name = "alphabet", nullable = false)
    private Alphabet alphabet;

    @Enumerated(EnumType.STRING)
    @Column(name = "category", nullable = false)
    private Category category;

    @Column(name = "frequency", nullable = false)
    private Integer frequency;

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    public String getExample() {
        return example;
    }

    public void setExample(String example) {
        this.example = example;
    }

    public Alphabet getAlphabet() {
        return alphabet;
    }

    public void setAlphabet(Alphabet alphabet) {
        this.alphabet = alphabet;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Integer getFrequency() {
        return frequency;
    }

    public void setFrequency(Integer frequency) {
        this.frequency = frequency;
    }

    @Override
    public String toString() {
        return "Word{" +
                "word='" + word + '\'' +
                ", definition='" + definition + '\'' +
                ", example='" + example + '\'' +
                ", alphabet=" + alphabet +
                ", category=" + category +
                ", frequency=" + frequency +
                '}';
    }
}
