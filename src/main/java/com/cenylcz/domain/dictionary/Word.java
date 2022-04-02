package com.cenylcz.domain.dictionary;

import com.cenylcz.Model;
import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "word", schema = "dictionary")
public class Word extends Model  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "word_key", unique = true, nullable = false)
    private Integer wordKey;

    @Column(name = "word", nullable = false)
    private String word;

    @Column(name = "meaning", nullable = false)
    private String meaning;

    @Column(name = "frequency", nullable = false)
    private Integer frequency;

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

    public String getMeaning() {
        return meaning;
    }

    public void setMeaning(String meaning) {
        this.meaning = meaning;
    }

    public Integer getFrequency() {
        return frequency;
    }

    public void setFrequency(Integer frequency) {
        this.frequency = frequency;
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
        return Objects.equals(wordKey, word1.wordKey) && Objects.equals(word, word1.word) && Objects.equals(meaning, word1.meaning) && Objects.equals(frequency, word1.frequency) && Objects.equals(example, word1.example);
    }

    @Override
    public int hashCode() {
        return Objects.hash(wordKey, word, meaning, frequency, example);
    }

    @Override
    public String toString() {
        return "Word{" +
                "wordKey=" + wordKey +
                ", word='" + word + '\'' +
                ", meaning='" + meaning + '\'' +
                ", frequency=" + frequency +
                ", example='" + example + '\'' +
                '}';
    }
}
