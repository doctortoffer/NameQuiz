package com.trifork.ckp.namequiz.model.stubs;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.trifork.ckp.namequiz.model.AnswerOption;
import com.trifork.ckp.namequiz.util.JsonFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public final class StubbedAnswerOptionsFactory {

    public StubbedAnswerOptionsFactory() {
    }

    public List<AnswerOption> produceAnswerOptions(String fileName) {
        List<AnswerOption> answerOptions = new ArrayList<>();
        JsonElement json;
        try {
            json = new JsonParser().parse(
                    new JsonFile(fileName).open()
            );
        } catch (IOException e) {
            throw new IllegalArgumentException(String.format("Couldn't parse file %s as Json", fileName), e);
        }

        JsonArray names = json.getAsJsonObject().getAsJsonArray("answer_options");
        for (JsonElement name : names) {
            answerOptions.add(new AnswerOption(name.getAsString()));
        }

        return answerOptions;
    }
}