package org.tmaxcloud.superpx.Dto;

public class TokenDto {
    /*
    -index: 0
    -source: {source: Java9Lexer, stream: CodePointCharStream}
    -start: 0
    -stop: 0
    -_channel: 0
    -_charPositionInLine: 0
    _line: 1
    _text: undefined
    _type: 70
    -channel: 0
    -charPositionInLine: 0
    -inputStream: CodePointCharStream
    -line: 1
    -startIndex: 0
    -stopIndex: 0
    -text: "{"
    -tokenIndex: 0
    -tokenSource: Java9Lexer
    -type: 70
    * */
    private int projectId;
    private int tokenId;
    private int index;
    private String source;
    private int start;
    private int startIndex;
    private int stop;
    private int stopIndex;
    private int channel;
    private int charPositionInLine;
    private String inputStream;
    private int line;
    private String text;
    private int tokenIndex;
    private String tokenSource;
    private int type;

    public TokenDto(int tokenId, int index, String source, int start, int startIndex, int stop, int stopIndex, int channel, int charPositionInLine, String inputStream, int line, String text, int tokenIndex, String tokenSource, int type) {
        this.tokenId = tokenId;
        this.index = index;
        this.source = source;
        this.start = start;
        this.startIndex = startIndex;
        this.stop = stop;
        this.stopIndex = stopIndex;
        this.channel = channel;
        this.charPositionInLine = charPositionInLine;
        this.inputStream = inputStream;
        this.line = line;
        this.text = text;
        this.tokenIndex = tokenIndex;
        this.tokenSource = tokenSource;
        this.type = type;
    }

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public int getTokenId() {
        return tokenId;
    }

    public void setTokenId(int tokenId) {
        this.tokenId = tokenId;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    public int getStop() {
        return stop;
    }

    public void setStop(int stop) {
        this.stop = stop;
    }

    public int getStopIndex() {
        return stopIndex;
    }

    public void setStopIndex(int stopIndex) {
        this.stopIndex = stopIndex;
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    public int getCharPositionInLine() {
        return charPositionInLine;
    }

    public void setCharPositionInLine(int charPositionInLine) {
        this.charPositionInLine = charPositionInLine;
    }

    public String getInputStream() {
        return inputStream;
    }

    public void setInputStream(String inputStream) {
        this.inputStream = inputStream;
    }

    public int getLine() {
        return line;
    }

    public void setLine(int line) {
        this.line = line;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getTokenIndex() {
        return tokenIndex;
    }

    public void setTokenIndex(int tokenIndex) {
        this.tokenIndex = tokenIndex;
    }

    public String getTokenSource() {
        return tokenSource;
    }

    public void setTokenSource(String tokenSource) {
        this.tokenSource = tokenSource;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "TokenDto{" +
                "projectId=" + projectId +
                ", tokenId=" + tokenId +
                ", index=" + index +
                ", source='" + source + '\'' +
                ", start=" + start +
                ", startIndex=" + startIndex +
                ", stop=" + stop +
                ", stopIndex=" + stopIndex +
                ", channel=" + channel +
                ", charPositionInLine=" + charPositionInLine +
                ", inputStream='" + inputStream + '\'' +
                ", line=" + line +
                ", text='" + text + '\'' +
                ", tokenIndex=" + tokenIndex +
                ", tokenSource='" + tokenSource + '\'' +
                ", type=" + type +
                '}';
    }
}
