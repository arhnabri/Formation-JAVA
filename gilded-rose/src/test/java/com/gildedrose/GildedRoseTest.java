package com.gildedrose;


import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

public class GildedRoseTest {
    /*
<nppcrypt version="1015">
<encryption cipher="cast256" mode="ecb" encoding="base64" />
<random iv="epY8CedLo9rujT2G3/BBfA==" salt="Pxu6G9JT5zbj83yGPn/K3w==" />
<key algorithm="scrypt" N="16384" r="8" p="1" />
</nppcrypt>
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
x0/A/Y6QD80r8Kd2h9ShAQ==
*/
}
