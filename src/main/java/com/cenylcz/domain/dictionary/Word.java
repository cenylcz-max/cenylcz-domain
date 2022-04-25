package com.cenylcz.domain.dictionary;

import com.cenylcz.Model;
import com.cenylcz.constant.Alphabet;
import com.cenylcz.constant.WordCategory;
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
    @Column(name = "word_category", nullable = false)
    private WordCategory wordCategory;

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

    public WordCategory getWordCategory() {
        return wordCategory;
    }

    public void setWordCategory(WordCategory wordCategory) {
        this.wordCategory = wordCategory;
    }

    @Override
    public String toString() {
        return "Word{" +
                "word='" + word + '\'' +
                ", definition='" + definition + '\'' +
                ", example='" + example + '\'' +
                ", alphabet=" + alphabet +
                ", wordCategory=" + wordCategory +
                '}';
    }
}
