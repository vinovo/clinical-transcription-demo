# Plaud

Plaud is a mobile app for capturing **clinical recordings** and turning them into documentation. Record (or import) audio, review playback and transcription, then generate a **SOAP-format summary** (Subjective, Objective, Assessment, Plan) you can copy into your workflow.

Transcription (ASR) and summarization (LLM) are powered by the [**Nexa SDK**](https://docs.nexa.ai).

## Prerequisite for Building

- Due to Git repo limitation, I am not able to push the Qwen3 4B GGUF file to this repo. If you want to build the app by yourself, you need properly places the following file `app/src/main/assets/nexa_models/Qwen3-4B-GGUF/Qwen3-4B-Q4_K_M.gguf`.
    - the best way for you to do this is to download through [Qwen3 4B offical GGUF repo](https://huggingface.co/Qwen/Qwen3-4B-GGUF/blob/main/Qwen3-4B-Q4_K_M.gguf)

## Core workflow

- Capture a recording (or import one) and save it as a note
- Let the app transcribe the audio into text
- Generate a SOAP note from the transcript
- Review results alongside audio playback, then copy what you need

## Outputs

- **Audio note**: playable recording with waveform + scrubbing
- **Transcript**: readable text version of the session
- **SOAP summary**: a structured note in the standard SOAP format

## Privacy

Plaud is designed to process audio **on-device** (as reflected in the UI), without needing to send recordings to a remote server.

## Current capabilities

- **Record or import audio** to create a note
- **Transcribe** the recording into text
- **Generate a SOAP summary** from the transcript
- **Play back** audio with waveform + scrubbing, and **copy** transcript/summary text

## Notes

- **Export**: the UI includes an export action, but it is not supported yet.
- **Disclaimer**: this is a demo app and is not medical advice or a medical device.