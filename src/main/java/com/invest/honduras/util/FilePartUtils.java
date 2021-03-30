package com.invest.honduras.util;

import java.io.InputStream;
import java.nio.ByteBuffer;

import org.springframework.core.io.buffer.DataBuffer;
import org.springframework.core.io.buffer.DataBufferUtils;
import org.springframework.http.codec.multipart.FilePart;

import reactor.core.publisher.Mono;

public class FilePartUtils {
//	public static Mono<byte[]> getByteArray(FilePart filePart) {
//		return DataBufferUtils.join(filePart.content()).map(DataBuffer::asByteBuffer).map(ByteBuffer::array);
//	}

//	public static Mono<InputStream> getInputStream(FilePart filePart) {
//		return DataBufferUtils.join(filePart.content()).map(DataBuffer::asInputStream);
//	}

//	public static FilePart prepareStorage(List<Part> parts, BaseStorage storage) {
//		FilePart filePart = null;
//		for (Part part : parts) {
//			if (part instanceof FilePart) {
//				filePart = (FilePart) part;
//				continue;
//			}
//			if (part instanceof FormFieldPart) {
//				FormFieldPart frmObs = (FormFieldPart) part;
//				if ("observation".equals(frmObs.name())) {
//					storage.setObservation(frmObs.value());
//				}
//
//			}
//
//		}
//
//		if (filePart == null)
//			throw new GeneralRuntimeException(HttpStatus.OK, TypeStatusCode.FILE_NOT_EXISTS.getCode(),
//					TypeStatusCode.FILE_NOT_EXISTS.getMessage());
//
//		storage.setContentType(filePart.headers().getContentType().toString());
//		storage.setFileName(filePart.filename().replace(" ", "_").trim());
//
//		return filePart;
//	}

//	private Mono<Storage> saveBigFile(FilePart filePart) {
//
//		final String namefile = filePart.filename().replace(" ", "_").trim();
//
//		final Storage storage = new Storage();
//		storage.setContentType(filePart.headers().getContentType().toString());
//		storage.setNameDocument(namefile);
//
//		return getInputStream(filePart).flatMap(input -> {
//
//			final DBObject metaData = new BasicDBObject();
//			metaData.put("type", filePart.headers().getContentType().toString());
//			metaData.put("tit le", namefile);
//
//			ObjectId id = gridFsTemplate.store(input, namefile, filePart.headers().getContentType().toString(),
//					metaData);
//			storage.setFile(new Binary(BsonBinarySubType.BINARY, id.toByteArray()));
//			return Mono.just(storage);
//		});
//	}

}
