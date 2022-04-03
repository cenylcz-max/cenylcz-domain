package com.cenylcz.domain.dictionary;

import com.cenylcz.Model;
import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "words", schema = "cenylcz")
public class Word extends Model  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "word_key", unique = true, nullable = false)
    private Integer wordKey;

    @Column(name = "word", nullable = false)
    private String word;

    @Column(name = "definition", nullable = false)
    private String definition;

    @Column(name = "example", nullable = true)
    private String example;

    public Integer getWordKey() {
        return wordKey;
    }

    public void setWordKey(Integer wordKey) {
        this.wordKey = wordKey;
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Word word1 = (Word) o;
        return Objects.equals(wordKey, word1.wordKey) && Objects.equals(word, word1.word) && Objects.equals(definition, word1.definition) && Objects.equals(example, word1.example);
    }

    @Override
    public int hashCode() {
        return Objects.hash(wordKey, word, definition, example);
    }

    @Override
    public String toString() {
        return "Word{" +
                "wordKey=" + wordKey +
                ", word='" + word + '\'' +
                ", definition='" + definition + '\'' +
                ", example='" + example + '\'' +
                '}';
    }
}
