package com.cenylcz.domain.dictionary;

import com.cenylcz.Model;
import com.cenylcz.constant.Alphabet;
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

    @Override
    public String toString() {
        return "Word{" +
                "word='" + word + '\'' +
                ", definition='" + definition + '\'' +
                ", example='" + example + '\'' +
                ", alphabet=" + alphabet +
                '}';
    }
}
